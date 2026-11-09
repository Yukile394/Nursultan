package minecraft;

import java.util.Optional;

public record class08049(String owner, String objectiveName, int score, Optional<class00392> display, Optional<class01762> numberFormat)
   implements class00381<class07280> {
   public static final class02362<class04247, class08049> N = class02362.N(
      class02389.s,
      class08049::N,
      class02389.s,
      class08049::y,
      class02389.B,
      class08049::L,
      class03748.i,
      class08049::u,
      class01787.u,
      class08049::M,
      class08049::new
   );

   public int L() {
      return this.score;
   }

   public Optional<class01762> M() {
      return this.numberFormat;
   }

   public class08049(String owner, String objectiveName, int score, Optional<class00392> display, Optional<class01762> numberFormat) {
      super();
      this.owner = owner;
      this.objectiveName = objectiveName;
      this.score = score;
      this.display = display;
      this.numberFormat = numberFormat;
   }

   public Optional<class00392> u() {
      return this.display;
   }

   public String y() {
      return this.objectiveName;
   }

   public String N() {
      return this.owner;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class08049> method_65080() {
      return class04248.NC;
   }
}
