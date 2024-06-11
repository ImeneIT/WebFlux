db = db.getSiblingDB('reactivedb');
db.createUser(
    {
        user: "reactiveuser",
        pwd: "reactivepassword",
        roles: [ { role: "readWrite", db: "reactivedb" } ]
    }
);
