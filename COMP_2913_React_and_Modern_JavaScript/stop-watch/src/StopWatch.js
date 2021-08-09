import { Component } from 'react';

function padTime(num) {
  return num < 10 ? `0${num}` : num;
}

function getReadableTime(counter) {
  const seconds = counter % 60;
  const minutes = Math.floor(counter / 60);
  return `${padTime(minutes)}:${padTime(seconds)}`;
}

class StopWatch extends Component {
  constructor(props) {
    super(props);

    this.state = {
      counter: 0,
      isPaused: false
    };
  }

  componentDidMount() {
    this.startCounter();
  }

  startCounter = () => {
    this.interval = setInterval(() => {
      this.setState({ counter: this.state.counter + 1, isPaused: false });
    }, 1000);
  }

  handlePause = () => {
    if (this.state.isPaused) {
      return this.startCounter();
    }
    clearInterval(this.interval);
    this.setState({ isPaused: true });
  }

  handleReset = () => {
    // NOTE: If you didn't clear interval here, that's fine.
    // You can find alternatives to skip counting, since this 
    // exercise's purpose is to practice React.
    clearInterval(this.interval);
    this.setState({ counter: 0, isPaused: true });
  }


  render() {
    const buttonLabel = this.state.isPaused ? 'Resume' : 'Pause';
    return (
      <div>
        <h1>Stop Watch</h1>
        <time>{getReadableTime(this.state.counter)}</time>
        <div>
          <button onClick={this.handlePause}>{buttonLabel}</button>
          <button
            onClick={this.handleReset}
            disabled={this.state.isPaused && this.state.counter === 0}
          >
            Reset
          </button>
        </div>
      </div>
    );
  }
}

export default StopWatch;