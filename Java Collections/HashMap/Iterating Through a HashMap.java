// Using keySet()

HashMap<String, Integer> map = new HashMap<>();
// Add elements to the HashMap

for (String key : map.keySet()) {
    Integer value = map.get(key);
    // Process the key-value pair
}

// --------------------------------------------------------------------------------

// Using entrySet()

HashMap<String, Integer> map = new HashMap<>();
// Add elements to the HashMap

for (Map.Entry<String, Integer> entry : map.entrySet()) {
    String key = entry.getKey();
    Integer value = entry.getValue();
    // Process the key-value pair
}

