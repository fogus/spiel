(ns fibndeck.core
  (:require [card-shuffle :as shuffle]))

(comment

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
  
  (-> fibn
      shuffle/riffle
      shuffle/overhand
      shuffle/riffle)




  )

(defn pprint-deck [deck]
  )


