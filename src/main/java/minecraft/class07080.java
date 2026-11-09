package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletionException;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07080 {
   private static final Logger N = LogUtils.getLogger();
   private static final DateTimeFormatter y = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.ROOT);
   private final String L;
   private final Throwable u;
   private final List<class07074> i = Lists.newArrayList();
   @Nullable
   private Path R;
   private boolean M = true;
   private StackTraceElement[] B = new StackTraceElement[0];
   private final class03463 Z = new class03463();

   public String L() {
      StringBuilder stringbuilder = new StringBuilder();
      this.N(stringbuilder);
      return stringbuilder.toString();
   }

   public static void M() {
      class04583.N();
      new class07080("Don't panic!", new Throwable()).N(class02587.N);
   }

   public class07080(String var1, Throwable var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   @Nullable
   public Path i() {
      return this.R;
   }

   public String u() {
      StringWriter stringwriter = null;
      PrintWriter printwriter = null;
      Object object = this.u;
      if (object.getMessage() == null) {
         if (object instanceof NullPointerException) {
            object = new NullPointerException(this.L);
         } else if (object instanceof StackOverflowError) {
            object = new StackOverflowError(this.L);
         } else if (object instanceof OutOfMemoryError) {
            object = new OutOfMemoryError(this.L);
         }

         object.setStackTrace(this.u.getStackTrace());
      }

      String s;
      try {
         stringwriter = new StringWriter();
         printwriter = new PrintWriter(stringwriter);
         object.printStackTrace(printwriter);
         s = stringwriter.toString();
      } finally {
         IOUtils.closeQuietly(stringwriter);
         IOUtils.closeQuietly(printwriter);
      }

      return s;
   }

   public Throwable y() {
      return this.u;
   }

   public class07074 N(String var1) {
      return this.N(var1, 1);
   }

   public class07074 N(String var1, int var2) {
      class07074 class07074 = new class07074(var1);
      if (this.M) {
         int ix = class07074.N(var2);
         StackTraceElement[] astacktraceelement = this.u.getStackTrace();
         StackTraceElement stacktraceelement = null;
         StackTraceElement stacktraceelement1 = null;
         int j = astacktraceelement.length - ix;
         if (j < 0) {
            N.error("Negative index in crash report handler ({}/{})", astacktraceelement.length, ix);
         }

         if (astacktraceelement != null && 0 <= j && j < astacktraceelement.length) {
            stacktraceelement = astacktraceelement[j];
            if (astacktraceelement.length + 1 - ix < astacktraceelement.length) {
               stacktraceelement1 = astacktraceelement[astacktraceelement.length + 1 - ix];
            }
         }

         this.M = class07074.N(stacktraceelement, stacktraceelement1);
         if (astacktraceelement != null && astacktraceelement.length >= ix && 0 <= j && j < astacktraceelement.length) {
            this.B = new StackTraceElement[j];
            System.arraycopy(astacktraceelement, 0, this.B, 0, this.B.length);
         } else {
            this.M = false;
         }
      }

      this.i.add(class07074);
      return class07074;
   }

   public static class07080 N(Throwable var0, String var1) {
      while (var0 instanceof CompletionException && var0.getCause() != null) {
         var0 = var0.getCause();
      }

      class07080 class07080;
      if (var0 instanceof class07878) {
         class07080 = ((class07878)var0).N();
      } else {
         class07080 = new class07080(var1, var0);
      }

      return class07080;
   }

   public void N(StringBuilder var1) {
      if ((this.B == null || this.B.length <= 0) && !this.i.isEmpty()) {
         this.B = (StackTraceElement[])ArrayUtils.subarray(this.i.get(0).N(), 0, 1);
      }

      if (this.B != null && this.B.length > 0) {
         var1.append("-- Head --\n");
         var1.append("Thread: ").append(Thread.currentThread().getName()).append("\n");
         var1.append("Stacktrace:\n");

         for (StackTraceElement stacktraceelement : this.B) {
            var1.append("\t").append("at ").append(stacktraceelement);
            var1.append("\n");
         }

         var1.append("\n");
      }

      for (class07074 class07074 : this.i) {
         class07074.N(var1);
         var1.append("\n\n");
      }

      this.Z.N(var1);
   }

   public String N() {
      return this.L;
   }

   public String N(class02587 var1) {
      return this.N(var1, List.of());
   }

   public String N(class02587 var1, List<String> var2) {
      StringBuilder stringbuilder = new StringBuilder();
      var1.N(stringbuilder, var2);
      stringbuilder.append("Time: ");
      stringbuilder.append(y.format(ZonedDateTime.now()));
      stringbuilder.append("\n");
      stringbuilder.append("Description: ");
      stringbuilder.append(this.L);
      stringbuilder.append("\n\n");
      stringbuilder.append(this.u());
      stringbuilder.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");

      for (int ix = 0; ix < 87; ix++) {
         stringbuilder.append("-");
      }

      stringbuilder.append("\n\n");
      this.N(stringbuilder);
      return stringbuilder.toString();
   }

   public boolean N(Path var1, class02587 var2) {
      return this.N(var1, var2, List.of());
   }

   public boolean N(Path var1, class02587 var2, List<String> var3) {
      if (this.R != null) {
         return false;
      } else {
         try {
            if (var1.getParent() != null) {
               class06290.L(var1.getParent());
            }

            try (BufferedWriter bufferedwriter = Files.newBufferedWriter(var1, StandardCharsets.UTF_8)) {
               bufferedwriter.write(this.N(var2, var3));
            }

            this.R = var1;
            return true;
         } catch (Throwable throwable1) {
            N.error("Could not save crash report to {}", var1, throwable1);
            return false;
         }
      }
   }

   public class03463 R() {
      return this.Z;
   }
}
