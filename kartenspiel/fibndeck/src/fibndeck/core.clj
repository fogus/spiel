(ns fibndeck.core
  (:require [card-shuffle :as shuffle]
            [clojure.string :as string]))

(def fibn [{:rank 0,  :suit :circle,   :color :blue          :unicode :○  }
             {:rank 13, :suit :circle,   :color :blue          :unicode :○  }
             {:rank 5,  :suit :ku,       :color :yellow        :unicode :く }
             {:rank 8,  :suit :ku,       :color :yellow        :unicode :く }
             {:rank 13, :suit :ku,       :color :yellow        :unicode :く }
             {:rank 5,  :suit :heart,    :color :purple        :unicode :♡  }
             {:rank 8,  :suit :heart,    :color :purple        :unicode :♡  }
             {:rank 13, :suit :heart,    :color :purple        :unicode :♡  }
             {:rank 13, :suit :heart,    :color :purple        :unicode :♡  }
             {:rank 13, :suit :heart,    :color :purple        :unicode :♡  }
             {:rank 3,  :suit :triangle, :color :red, :pips 1  :unicode :◬  }
             {:rank 5,  :suit :triangle, :color :red, :pips 2  :unicode :▲  }
             {:rank 8,  :suit :triangle, :color :red, :pips 3  :unicode :∴  }
             {:rank 8,  :suit :triangle, :color :red, :pips 1  :unicode :◬  }
             {:rank 13, :suit :triangle, :color :red, :pips 2  :unicode :▲  }
             {:rank 13, :suit :triangle, :color :red, :pips 3  :unicode :∴  }
             {:rank 1,  :suit :square,   :color :green         :unicode :□  }
             {:rank 2,  :suit :square,   :color :green         :unicode :□  }
             {:rank 3,  :suit :square,   :color :green         :unicode :□  }
             {:rank 5,  :suit :square,   :color :green         :unicode :□  }
             {:rank 8,  :suit :square,   :color :green         :unicode :□  }
             {:rank 8,  :suit :square,   :color :green         :unicode :□  }
             {:rank 13, :suit :square,   :color :green         :unicode :□  }
             {:rank 13, :suit :square,   :color :green         :unicode :□  }
             {:rank 13, :suit :square,   :color :green         :unicode :□  }
             {:rank 1,  :suit :shogi,    :color :orange        :unicode :☖  :piece :king           :kanji :王  :name :oushou}
             {:rank 2,  :suit :shogi,    :color :orange        :unicode :☖  :piece :king           :kanji :王  :name :oushou}
             {:rank 3,  :suit :shogi,    :color :orange        :unicode :☖  :piece :rook           :kanji :飛  :name :hisha}
             {:rank 5,  :suit :shogi,    :color :orange        :unicode :☖  :piece :rook           :kanji :飛  :name :hisha}
             {:rank 8,  :suit :shogi,    :color :orange        :unicode :☖  :piece :bishop         :kanji :角  :name :kakugyou}
             {:rank 8,  :suit :shogi,    :color :orange        :unicode :☖  :piece :bishop         :kanji :角  :name :kakugyou}
             {:rank 13, :suit :shogi,    :color :orange        :unicode :☖  :piece :pawn           :kanji :歩  :name :fuhyou}
             {:rank 13, :suit :shogi,    :color :orange        :unicode :☖  :piece :pawn           :kanji :歩  :name :fuhyou}
             {:rank 13, :suit :shogi,    :color :orange        :unicode :☖  :piece :promoted-pawn  :kanji :と  :name :tokin}
             ])



(defn pprint-deck [deck]
  (doseq [card deck]
    (println (str (:rank card) (name (:unicode card))))))


(defn deal
  ([deck hands per]
     (assert (< (* hands per) (count deck)))
     (let [to-deal (* hands per)
           dealt (take to-deal deck)
           deals (partition per dealt)
           stock (drop to-deal deck)]
       {:hands (vec (map vec deals))
        :stock stock})))


(defn pprint-hands [{:keys [hands stock]}]
  (let [compr-hands (map (fn [hand] (map #(str (:rank %) (name (:unicode %))) hand))
                         hands)
        compr-hands (map sort compr-hands)]
    (doseq [hand compr-hands]
      (println (string/join " " hand)))))

(defn shuffle-deck [deck]
  (-> deck
      shuffle/riffle
      shuffle/overhand
      shuffle/riffle
      shuffle/overhand
      shuffle/riffle))

(comment

  (-> fibn
      shuffle-deck
      (deal 2 11)
      pprint-hands)

)

