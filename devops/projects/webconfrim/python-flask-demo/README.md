# Python Flask Demo

A minimal Flask application for testing DevOps deployment pipelines.

## Requirements
- Python 3.8 or higher
- pip

## How to Run

### Install Dependencies
```bash
pip install -r requirements.txt
```

### Run the Application
```bash
python app.py
```

Or using Flask CLI:
```bash
flask run --host=0.0.0.0 --port=5000
```

## Test the Application
Once running, visit: http://localhost:5000/

Expected response: `Hello DevOps`

## Project Structure
```
├── app.py
├── requirements.txt
└── README.md
```

## Docker Support (Optional)
You can also create a Dockerfile:
```dockerfile
FROM python:3.11-slim
WORKDIR /app
COPY requirements.txt .
RUN pip install -r requirements.txt
COPY app.py .
EXPOSE 5000
CMD ["python", "app.py"]