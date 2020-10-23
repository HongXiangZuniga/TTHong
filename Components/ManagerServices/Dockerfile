# set base image (host OS)
FROM python:3.9

# set the working directory in the container
WORKDIR /code

# copy the dependencies file to the working directory
COPY requirements.txt .

# install dependencies
RUN pip install Flask
RUN pip install requests

# copy the content of the local src directory to the working directory
COPY src/ .

# command to run on container star
CMD [ "python", "./ManagerSerives.py" ]