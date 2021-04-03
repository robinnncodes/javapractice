import React from "react";
import Tweet from "./Tweet";

const TweetList = ({ name, tweets, setTweets }) => {
  return (
    <div className="tweets">
      <div>
        {tweets.map((
          tweet //map will go over each item in an array
        ) => (
          <Tweet
            name={name}
            tweet={tweet}
            setTweets={setTweets}
            tweets={tweets}
            key={tweet.id}
          />
        ))}
      </div>
    </div>
  );
};

export default TweetList;
