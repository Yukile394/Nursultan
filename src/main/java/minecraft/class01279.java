package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public interface class01279 {
   String n_ = "anger_end_time";
   String o_ = "angry_at";
   long p_ = -1L;

   @Nullable
   class07438 T();

   class07299 method_73183();

   default void y(class04782 var1, class08036 var2) {
      if (var1.method_64395().N(class07305.P)) {
         class08372<class07438> class08372 = this.W();
         if (class08372 != null && class08372.y(var2)) {
            this.R_();
         }
      }
   }

   default void y(long var1) {
      this.N(this.method_73183().N() + var1);
   }

   void y(@Nullable class07438 var1);

   long E();

   default void N(class04782 var1, boolean var2) {
      class07438 class07438 = this.T();
      class08372<class07438> class08372 = this.W();
      if (class07438 != null && class07438.method_29504() && class08372 != null && class08372.y(class07438) && class07438 instanceof class07079) {
         this.R_();
      } else {
         if (class07438 != null) {
            if (class08372 == null || !class08372.y(class07438)) {
               this.N(class08372.N(class07438));
            }

            this.W_();
         }

         if (class08372 != null && !this.P_() && (class07438 == null || !N(class07438) || !var2)) {
            this.R_();
         }
      }
   }

   private static boolean N(class07438 var0) {
      return var0 instanceof class08036 class08036 && !class08036.method_68878() && !class08036.method_7325();
   }

   void N(@Nullable class08372<class07438> var1);

   void N(long var1);

   default boolean N(class07438 var1, class04782 var2) {
      if (!this.method_18395(var1)) {
         return false;
      } else if (N(var1) && this.a_(var2)) {
         return true;
      } else {
         class08372<class07438> class08372 = this.W();
         return class08372 != null && class08372.y(var1);
      }
   }

   default void N(class08329 var1) {
      var1.N("anger_end_time", this.E());
      var1.y("angry_at", class08372.N(), this.W());
   }

   default void N(class07299 var1, class08299 var2) {
      Optional<Long> optional = var2.R("anger_end_time");
      if (optional.isPresent()) {
         this.N(optional.get());
      } else {
         Optional<Integer> optional1 = var2.i("AngerTime");
         if (optional1.isPresent()) {
            this.y(optional1.get().intValue());
         } else {
            this.N(-1L);
         }
      }

      if (var1 instanceof class04782) {
         this.N(class08372.N(var2, "angry_at"));
         this.y(class08372.y(this.W(), var1));
      }
   }

   @Nullable
   class08372<class07438> W();

   default boolean a_(class04782 var1) {
      return var1.method_64395().N(class07305.NR) && this.P_() && this.W() == null;
   }

   @Nullable
   class07438 method_6065();

   boolean method_18395(class07438 var1);

   void method_6015(@Nullable class07438 var1);

   void W_();

   default boolean P_() {
      long i = this.E();
      return i > 0L ? i - this.method_73183().N() > 0L : false;
   }

   default void Q_() {
      this.R_();
      this.W_();
   }

   default void R_() {
      this.method_6015(null);
      this.N(null);
      this.y(null);
      this.N(-1L);
   }
}
