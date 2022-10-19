from flask import Flask

app = Flask(__name__)

@app.route("/hello")
def hello_word():
    return "from todo", 200

if __name__ == "__main__":
    app.run()

