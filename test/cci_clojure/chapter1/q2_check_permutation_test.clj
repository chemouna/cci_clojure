(ns cci-clojure.chapter1.q2-check-permutation-test
  (:require [cci-clojure.chapter1.q2-check-permutation :refer :all]
            [clojure.test :refer :all]))

(deftest permutations-test
  (is (permutation? nil nil))
  (is (permutation? "" ""))
  (is (permutation? "a" "a"))
  (is (not (permutation? "a" "b")))
  (is (permutation? "ab" "ba"))
  (is (permutation? "cab" "bac"))
  (is (permutation? "cabc" "bcac")))

