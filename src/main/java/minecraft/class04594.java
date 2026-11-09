package minecraft;

import Nursultan.class10460;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringEscapeUtils;
import org.jspecify.annotations.Nullable;

public class class04594 {
   private static final String N = "\r\n";
   private static final String y = ",";
   private final Writer L;
   private final int u;

   public class04594(Writer var1, List<String> var2) throws IOException {
      super();
      this.L = var1;
      this.u = var2.size();
      this.N(var2.stream());
   }

   private static String N(@Nullable Object var0) {
      return StringEscapeUtils.escapeCsv(var0 != null ? var0.toString() : "[null]");
   }

   private void N(Stream<? extends Object> var1) throws IOException {
      this.L.write(var1.<CharSequence>map(class04594::N).collect(Collectors.joining(",")) + "\r\n");
   }

   public void N(Object... var1) throws IOException {
      if (var1.length != this.u) {
         throw new IllegalArgumentException("Invalid number of columns, expected " + this.u + ", but got " + var1.length);
      } else {
         this.N(Stream.of(var1));
      }
   }

   public static class10460 N() {
      return new class10460();
   }
}
