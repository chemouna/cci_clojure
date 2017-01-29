(ns cci-clojure.chapter1.q9-is-rotation
  (:require [clojure.test :refer :all]))

(defn rotation?
  [s1 s2]
  (and (= (count s1) (count s2))
       (.contains (str s1 s1) s2)))

(deftest a-test
  (testing
    (is (= (rotation? "abc" "ab") false))
    (is (= (rotation? "abc" "abc") true))
    (is (= (rotation? "waterbottle" "erbottlewat") true))))

(run-tests)
