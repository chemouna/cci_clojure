(ns cci-clojure.chapter1.q2-check-permutation)

(defn permutation?
  [s1 s2]
  (= (sort s1) (sort s2)))


