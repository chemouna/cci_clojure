(ns cci-clojure.chapter1.q4-permutation-of-palindrome)

;; (defn is_palindrome_permutation
;;   [s]
;;   ;; (count (filter false? (map even? (vals (frequencies "aabbc"))))) > 2
;;   (maxOneOdd (frequency_table s)))


(defn is_palindrome_permutation_2
  [s]
  (let [occurences (vals (frequencies s))]
    (let [even-occ (filter false? (map even? occurences))]
      (> (count even-occ) 1))))

(is_palindrome_permutation_2 "aaaa")
