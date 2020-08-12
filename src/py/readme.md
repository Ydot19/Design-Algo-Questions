# Python Algorithms

Used to store the code for algorithms and data structures in python

## Code Documentation

Code documentation is parsed and created via html [pydoc3](https://github.com/pdoc3/pdoc)

To run complete the follow
- Create virtualenv using pipenv
- Run `pipenv install`
- View the docs with `pipenv run view-docs`
    - Note: This script is found in Pipefile 
    - Note: Assumes firefox is installed
- To update the code docs run `pipenv run gen-docs` 
    - Note: This generates/creates new code docs