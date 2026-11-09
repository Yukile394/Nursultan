package minecraft;

public record class08068(long gameTime, long dayTime, boolean tickDayTime) implements class00381<class07280> {
   public static final class02362<class00667, class08068> N = class02362.N(
      class02389.z, class08068::N, class02389.z, class08068::y, class02389.y, class08068::L, class08068::new
   );

   public boolean L() {
      return this.tickDayTime;
   }

   public class08068(long gameTime, long dayTime, boolean tickDayTime) {
      this.gameTime = gameTime;
      this.dayTime = dayTime;
      this.tickDayTime = tickDayTime;
   }

   public long y() {
      return this.dayTime;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public long N() {
      return this.gameTime;
   }

   @Override
   public class02897<class08068> method_65080() {
      return class04248.ND;
   }
}
