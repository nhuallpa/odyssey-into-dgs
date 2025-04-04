# (Odyssey Course) Intro to GraphQL with Java & DGS

## Apollo Server

    https://studio.apollographql.com/sandbox/explorer

## Mutation example

Operation
```
mutation CreateListing($input: CreateListingInput!) {
  createListing(input: $input) {
    code
    success
    message
    listing {
      title
      description
      costPerNight
      amenities {
        name
        category
      }
    }
  }
}
```

Variables
```
{
  "input": {
    "title": "Mars' top destination",
    "description": "A really cool place to stay",
    "costPerNight": 44.0,
    "amenities": ["am-1", "am-2"],
    "numOfBeds": 2
  }
}
```


