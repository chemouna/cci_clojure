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

;; Using Set (non-lazy) by going through the string and putting its
;; elements in a set and comparing at the end if the size of the set
;; is the same as the size of the string if so then there are only
;; unique characters.

(defn all_unique_characters4
  [s]
  (let [char-set (reduce #(conj %1 %2) #{} s)]
    (== (count char-set) (count s))))

(all_unique_characters4 "abcd")
(all_unique_characters4 "aaabcdee")

