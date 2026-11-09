package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public abstract class class05407 extends class05096 {
   protected static final int G = 17;
   protected static final int l = 7;
   protected static final long d = 5368709120L;
   protected static final int w = -11776948;
   protected static final int k = -9671572;
   protected static final int Y = -8388737;
   protected static final int Q = -13408581;
   protected static final int O = -9670204;
   protected static final int g = 32;
   protected static final int I = 8;
   protected static final class01894 J = class01894.y("textures/gui/title/realms.png");
   protected static final int o = 128;
   protected static final int q = 34;
   protected static final int K = 128;
   protected static final int V = 64;
   private final List<class05389> N = Lists.newArrayList();

   public class05407(class00392 var1) {
      super(var1);
   }

   protected static class03608 U() {
      return class03608.N(128, 34, J, 128, 64);
   }

   public class00392 z() {
      return class05220.N(this.N.stream().map(class05389::N).collect(Collectors.toList()));
   }

   protected static int N(int var0) {
      return 40 + var0 * 13;
   }

   protected class05389 N(class05389 var1) {
      this.N.add(var1);
      return this.method_37060(var1);
   }
}
