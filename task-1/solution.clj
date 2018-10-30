(defn draw_square [side_size] 
    (loop [x side_size]
        (when (> x 0)
            (if (or (= x side_size) (= x 1))
               (println (apply str (repeat side_size "*")))
               (println (format "*%s*" (apply str (repeat (- side_size 2) " "))))
            )
            (recur (- x 1))
        )
    )
)
(draw_square (read))
