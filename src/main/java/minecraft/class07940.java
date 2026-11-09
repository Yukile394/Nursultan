package minecraft;

import Nursultan.class10855;
import Nursultan.class10856;
import Nursultan.class10857;
import com.google.gson.JsonElement;
import org.jspecify.annotations.Nullable;

public interface class07940<Params, Result> {
   String N = "notification/";

   static class07930<Void, Void> L() {
      return new class07930<>(class10857::new);
   }

   static <Result> class07930<Void, Result> i() {
      return new class07930<>(class10855::new);
   }

   static <Params> class07930<Params, Void> u() {
      return new class07930<>(class10856::new);
   }

   class07924 y();

   class07931<Params, Result> N();

   @Nullable
   default Result N(JsonElement var1) {
      return null;
   }

   @Nullable
   default JsonElement N(Params var1) {
      return null;
   }

   static <Params, Result> class07930<Params, Result> R() {
      return new class07930<>(class07912::new);
   }
}
