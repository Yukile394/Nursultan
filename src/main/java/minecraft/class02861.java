package minecraft;

public record class02861(long[] sample, class02303 debugSampleType) implements class00381<class07280> {
   public static final class02362<class00667, class02861> N = class00381.N(class02861::N, class02861::new);

   private class02861(class00667 var1) {
      this(var1.u(), var1.y(class02303.class));
   }

   public class02861(long[] sample, class02303 debugSampleType) {
      super();
      this.sample = sample;
      this.debugSampleType = debugSampleType;
   }

   public class02303 y() {
      return this.debugSampleType;
   }

   private void N(class00667 var1) {
      var1.N(this.sample);
      var1.N((Enum<?>)this.debugSampleType);
   }

   public long[] N() {
      return this.sample;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class02861> method_65080() {
      return class04248.O;
   }
}
