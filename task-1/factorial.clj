(defn factorial[x] (if (<= x 1) 1 (* x (factorial (- x 1)))))
(println (factorial (read)))