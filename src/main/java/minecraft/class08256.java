package minecraft;

import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class class08256 {
   private static final String y = "missingno";
   public static final class01894 N = class01894.y("builtin/missing");

   public class08256() {
      super();
   }

   public static class00167 N() {
      class02052 class02052 = new class02052(0.0F, 0.0F, 16.0F, 16.0F);
      Map map = class07536.N_74(class07211.class, var1x -> new class02067(var1x, -1, "missingno", class02052, class08511.field_57029));
      class02081 class02081 = new class02081(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), map);
      return new class04237(
         new class08505(List.of(class02081)),
         null,
         null,
         class03702.N,
         new class08823().N("particle", "missingno").N("missingno", new class05913(class08626.N, class08923.L())).N(),
         null
      );
   }
}
