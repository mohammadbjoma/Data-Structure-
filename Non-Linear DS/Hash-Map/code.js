const map = new Map();

// INSERT
map.set("Alice", 25);
map.set("Bob", 30);
map.set("Charlie", 35);

// TRAVERSE
for (let [key, value] of map.entries()) {
  console.log(key + " -> " + value);
}

// SEARCH
console.log("Search Bob:", map.has("Bob"));

// DELETE
map.delete("Alice");
console.log("After deleting Alice:", map);

// COUNT
console.log("Size:", map.size);
