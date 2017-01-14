(ns cci-clojure.chapter1.q2_check_permutation)

(defn permutation?
  [s1 s2]
  (= (sort s1) (sort s2)))

;; what i want to express is that if they dont have the same size the result cant be clt
