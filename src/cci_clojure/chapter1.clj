(ns cci-clojure.chapter1)

;; Chapter 1 - Problem 1
(defn all_unique_characters
  [s]
  (every? #(== % 1) (vals (frequencies s))))

(all_unique_characters "abcd")
(all_unique_characters "aaabcd")

(defn all_unique_characters2
  [s]
  (== (count (distinct s)) (count s)))

(all_unique_characters2 "abcd")
(all_unique_characters2 "aaabcdee")

(defn all_unique_characters3
  [s]
  (== (count (dedupe s)) (count s)))

(all_unique_characters3 "abcd")
(all_unique_characters3 "aaabcdee")

