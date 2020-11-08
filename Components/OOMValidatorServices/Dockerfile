# set base image (host OS)
FROM python:3.8

# set the working directory in the container

# copy the dependencies file to the working directory
COPY requirements.txt .

# install dependencies
RUN pip install Flask

# copy the content of the local src directory to the working directory
ADD . .

# command to run on container star
CMD [ "python", "src/OOMValidatorServices.py" ]
