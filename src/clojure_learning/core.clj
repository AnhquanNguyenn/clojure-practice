(ns clojure-learning.core
  (:gen-class))

(def str1 "Hello World!")

(defn reverseString [x]
  (println "Using just the reverse command:" (reverse x))
  (println "Using the apply to look nicer:" (apply str (reverse x)))
)

(defn loopNumberOfTimes [x]
  (dotimes [_ x]
    (println str1))    
)

(defn -main
  [& args]
  (println str1)
  (reverseString str1)
)

