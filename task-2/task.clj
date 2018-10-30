(defn prnumber [x y] (
    loop [i (min x y)] 
    (
        when (<= i (max x y))
        (println i)
        (recur (inc i))
    )
))
(prnumber (read) (read))
