(ns cci-clojure.chapter1.q4-permutation-of-palindrome
  (:require [clojure.string :as s]))

(defn is_palindrome_permutation_2
  [s]
  (let [occurences (vals (frequencies (s/lower-case s)))
        odd-occ (filter odd? occurences)]
      (zero? (count (filter #(> % 1) odd-occ)))))

;; (is_palindrome_permutation_2 "aaaabbbccc")
;; (is_palindrome_permutation_2 "aaaa")
;; (is_palindrome_permutation_2 "Tact Coa")
