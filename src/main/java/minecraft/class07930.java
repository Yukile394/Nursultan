package minecraft;

import org.jspecify.annotations.Nullable;

public class class07930<Params, Result> {
   public static final class07924 N = new class07924(true);
   private final class07927<Params, Result> y;
   private String L = "";
   @Nullable
   private class07920<Params> u;
   @Nullable
   private class07941<Result> i;

   public class07930(class07927<Params, Result> var1) {
      super();
      this.y = var1;
   }

   public class03529<class07940<Params, Result>> y(String var1) {
      return this.N(class01894.y("notification/" + var1));
   }

   public class07930<Params, Result> y(String var1, class07389<Params> var2) {
      this.u = new class07920<>(var1, var2);
      return this;
   }

   private class03529<class07940<Params, Result>> N(class01894 var1) {
      return class00751.y(class04206.NO, var1, this.N());
   }

   private class07940<Params, Result> N() {
      class07931 class07931 = new class07931<>(this.L, this.u, this.i);
      return this.y.create(class07931, N);
   }

   public class07930<Params, Result> N(String var1, class07389<Result> var2) {
      this.i = new class07941<>(var1, var2);
      return this;
   }

   public class07930<Params, Result> N(String var1) {
      this.L = var1;
      return this;
   }
}
