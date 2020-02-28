import React from "react";
import ReactDOM from "react-dom";

const stateInfo = states_info => {
  return (
    <div>
      <table>
        <thead>
          <tr>
            <th className="goldenb header">State</th>
            <th className="header">Population</th>
            <th className="header">Capital</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td className="golden white description">{states_info[0].state}</td>
            <td className="description">{states_info[0].population}</td>
            <td className="description">{states_info[0].capital}</td>
          </tr>
          <tr>
            <td className="golden white description">{states_info[1].state}</td>
            <td className="description">{states_info[1].population}</td>
            <td className="description">{states_info[1].capital}</td>
          </tr>
          <tr>
            <td className="golden white description">{states_info[2].state}</td>
            <td className="description">{states_info[2].population}</td>
            <td className="description">{states_info[2].capital}</td>
          </tr>
          <tr>
            <td className="golden white description">{states_info[3].state}</td>
            <td className="description">{states_info[3].population}</td>
            <td className="description">{states_info[3].capital}</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
};

const states_array = [
  { state: "Idaho", population: "", capital: "Boise" },
  { state: "Tennessee", population: "6.651M", capital: "Nashville" },
  { state: "Maine", population: "1.331M", capital: "Augusta" },
  { state: "Wisconsin", population: "5.779M", capital: "Madison" }
];
const root = document.getElementById("root");

ReactDOM.render(stateInfo(states_array), root);
