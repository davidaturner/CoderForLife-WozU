import React from "react";
import ReactDOM from "react-dom";

class List extends React.Component {
  shouldComponentUpdate(nextProps) {
    var current = this.props.items;
    var next = nextProps.items;
    if (next.length != current.length) {
      return true;
    }
    for (var i = 0; i < next.length; i++) {
      if (next[i] != current[i]) {
        return true;
      }
    }
    return false;
  }

  render() {
    console.log("List's render function");
    const list = this.props.items.map((items) => <li key={items}>{items}</li>);
    return <ul>{list}</ul>;
  }
}

const list1Items = ["Eggs", "Bread", "Artisan Cheese"];
const list2Items = ["Train", "Planes", "Automobiles"];

const renderItems = (items) => {
  ReactDOM.render(<List items={items}></List>, document.getElementById("root"));
};

document.addEventListener("keydown", (event) => {
  if (event.code == "Digit1") {
    renderItems(list1Items);
  } else if (event.code == "Digit2") {
    renderItems(list2Items);
  }
});

renderItems(list1Items);
