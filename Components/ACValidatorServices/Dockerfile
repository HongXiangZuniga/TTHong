# set base image (host OS)
FROM python:3.9

# set the working directory in the container
ADD . .

# copy the dependencies file to the working directory

# install dependencies
RUN pip install flask

# copy the content of the local src directory to the working directory

# command to run on container star
CMD [ "python", "src/ACValidatorServices.py" ]
