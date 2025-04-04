package com.example.listings.models;

import com.example.listings.generated.types.CreateListingInput;

/* don't change listing param name with listingInput because
* The serialization for object to json takes the parameter name as a node
* to build the json body
* */
public record CreateListingModel(CreateListingInput listing) { }
