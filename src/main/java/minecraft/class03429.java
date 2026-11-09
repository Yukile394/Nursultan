package minecraft;

import java.util.Set;

enum class03429 {
   field_46193(class00392.L("connect.connecting"), Set.of()),
   field_46194(class00392.L("connect.authorizing"), Set.of(field_46193)),
   field_46195(class00392.L("connect.encrypting"), Set.of(field_46194)),
   field_46196(class00392.L("connect.joining"), Set.of(field_46195, field_46193));

   final class00392 field_46197;
   final Set<class03429> field_46198;

   private class03429(class00392 var3, Set<class03429> var4) {
      this.field_46197 = var3;
      this.field_46198 = var4;
   }
}
