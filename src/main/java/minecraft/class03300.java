package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record class03300(List<class04890> pieces) {
   private static final Logger y = LogUtils.getLogger();
   private static final class01894 L = class01894.y("jigsaw");
   private static final Map<class01894, class01894> u = ImmutableMap.builder()
      .put(class01894.y("nvi"), L)
      .put(class01894.y("pcp"), L)
      .put(class01894.y("bastionremnant"), L)
      .put(class01894.y("runtime"), L)
      .build();

   public List<class04890> L() {
      return this.pieces;
   }

   public class03300(List<class04890> pieces) {
      super();
      this.pieces = List.copyOf(pieces);
   }

   public class05163 y() {
      return class04890.N(this.pieces.stream());
   }

   public class07709 N(class03298 var1) {
      class07741 class07741 = new class07741();

      for (class04890 class04890 : this.pieces) {
         class07741.add(class04890.N(var1));
      }

      return class07741;
   }

   public boolean N() {
      return this.pieces.isEmpty();
   }

   public static class03300 N(class07741 var0, class03298 var1) {
      ArrayList arraylist = Lists.newArrayList();

      for (int i = 0; i < var0.size(); i++) {
         class07001 class07001 = var0.y(i);
         class01894 class01894x = class01894.N(class07001.y("id", "").toLowerCase(Locale.ROOT));
         class01894 class01894x = u.getOrDefault(class01894x, class01894x);
         class04878 class04878 = class04206.p.N(class01894x);
         if (class04878 == null) {
            y.error("Unknown structure piece id: {}", class01894x);
         } else {
            try {
               class04890 class04890 = class04878.load(var1, class07001);
               arraylist.add(class04890);
            } catch (Exception exception) {
               y.error("Exception loading structure piece with id {}", class01894x, exception);
            }
         }
      }

      return new class03300(arraylist);
   }

   public boolean N(class07209 var1) {
      Iterator<class04890> iterator = this.pieces.iterator();

      while (iterator.hasNext()) {
         if (iterator.next().L().y(var1)) {
            return true;
         }
      }

      return false;
   }
}
