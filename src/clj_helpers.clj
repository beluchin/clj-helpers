(ns clj-helpers)

(defn single
  "(single [1])
  1

  (single [])
  Execution error (AssertionError) ...
  Assert failed: (seq x)

  (single [1 2])
  Execution error (AssertionError) ...
  Assert failed: (nil? (next x))

  (single [1 nil])
  Execution error (AssertionError) ...
  Assert failed: (nil? (next x))"
  [x]
  {:pre [(seq x) (nil? (next x))]} 
  (first x))
