import React, {useState, useEffect} from "react";
import CreateTweet from "./components/CreateTweet";
import TweetList from "./components/TweetList";


function App() {
  //State
  const [textInput, setTextInput] = useState("");
  const [tweets, setTweets] = useState([]);
  const [name, setName] = useState("Robin");
  const message = "hello there sexy";

  useEffect(() => {
    console.log("hehehehehehe");
  }, [textInput]);

  return (
    <div>
      <div className="text">
        <h1>Twitter Lite</h1>
        <CreateTweet textInput={textInput} setTextInput={setTextInput} tweets={tweets} setTweets={setTweets}/>
        <TweetList name={name} tweets={tweets} setTweets={setTweets}/>
      </div>
    </div>
  );
}




export default App;
