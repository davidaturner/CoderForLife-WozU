import React from "react";
import ReactDOM from "react-dom";

// Need <tbody> if you use <table> in order to
// match browser/Chrome DOM
var showme = (label1, label2, label3) => {
  return (
    <table>
      <thead>
        <tr>
          <th>{label1}</th>
          <th>{label2}</th>
          <th>{label3}</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>Idaho</td>
          <td></td>
          <td>Boise</td>
        </tr>
        <tr>
          <td>Tennessee</td>
          <td>6.651 million</td>
          <td>Capital</td>
        </tr>
        <tr>
          <td>Maine</td>
          <td>1.331 million</td>
          <td>Augusta</td>
        </tr>
        <tr>
          <td>Wisconsin</td>
          <td>5.779 million</td>
          <td>Madison</td>
        </tr>
      </tbody>
    </table>
  );
};

ReactDOM.render(
  showme("State", "Population", "Capital"),
  document.getElementById("root")
);
