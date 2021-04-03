import React from "react";
import styled from "styled-components";

const Title = styled.h1`
  font-size: 1.5em;
  color: lightblue;
`;

const Wrapper = styled.div`
  border: 1px solid palevioletred;
`;

const Tweet = ({ name, tweet, tweets, setTweets }) => {
  const deleteTweet = () => {
    setTweets(tweets.filter((state) => state.id !== tweet.id));
  };

  return (
    <Wrapper>
      <Title> {name} </Title>
      <p>{tweet.message}</p>
      <button>Submit</button>
      <button onClick={deleteTweet}>Delete</button>
    </Wrapper>
  );
};

export default Tweet;
