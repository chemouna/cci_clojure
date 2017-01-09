(ns cci-clojure.chapter1.q2-reverse-cstyle-str)

(defn reverse-cstyle-str
  [s]
  (apply str (reverse (butlast str))))
