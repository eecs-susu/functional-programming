(defn count_joins [sub arr] (
    loop [i 0 f 0] 
    (
        if (> i (- (count arr) (count sub)))
        f
        (recur (+ i 1) (+ f (
            if (= sub (take (count sub) (drop i arr)))
            1
            0
        ) ))
    )
))
(println (count_joins '(1, 2, 3) '(1, 2 ,3 , 4, 1, 2, 3, 1, 2, 3)))
 