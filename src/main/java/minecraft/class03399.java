package minecraft;

import com.google.common.collect.Lists;
import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportChatMessage;
import com.mojang.authlib.minecraft.report.ReportEvidence;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class03399 extends class02073<class03406> {
   @Nullable
   @Override
   public class02043 L() {
      if (this.N.N.isEmpty()) {
         return class02043.y;
      } else if (this.N.N.size() > this.y.maxReportedMessageCount()) {
         return class02043.L;
      } else if (this.N.R == null) {
         return class02043.N;
      } else {
         return this.N.i.length() > this.y.maxOpinionCommentsLength() ? class02043.u : super.L();
      }
   }

   public class03399(class03406 var1, AbuseReportLimits var2) {
      super(var1, var2);
   }

   public class03399(UUID var1, AbuseReportLimits var2) {
      super(new class03406(UUID.randomUUID(), Instant.now(), var1), var2);
   }

   public class03399 u() {
      return new class03399(this.N.y(), this.y);
   }

   private ReportEvidence y(class03409 var1) {
      ArrayList arraylist = new ArrayList();
      new class03791(this.y.leadingContextMessageCount()).N(var1.y(), this.N.N, (var2x, var3) -> arraylist.add(this.N(var3, this.y(var2x))));
      return new ReportEvidence(Lists.reverse(arraylist));
   }

   public boolean y(int var1) {
      return this.N.N.contains(var1);
   }

   @Override
   public boolean y() {
      return StringUtils.isNotEmpty(this.M()) || !this.N().isEmpty() || this.Z() != null;
   }

   private ReportChatMessage N(class03412 var1, boolean var2) {
      class02083 class02083 = var1.M().U();
      class03079 class03079 = var1.M().W();
      List list = class03079.u().y().stream().map(class04469::L).toList();
      ByteBuffer bytebuffer = class01962.N(var1.M().E(), class04469::L);
      return new ReportChatMessage(class02083.y(), class02083.L(), class02083.u(), class03079.y(), class03079.L(), list, class03079.N(), bytebuffer, var2);
   }

   @Override
   public Either<class02044, class02043> N(class03409 var1) {
      class02043 class02043 = this.L();
      if (class02043 != null) {
         return Either.right(class02043);
      } else {
         String s = Objects.requireNonNull(this.N.R).N();
         ReportEvidence reportevidence = this.y(var1);
         ReportedEntity reportedentity = new ReportedEntity(this.N.u);
         AbuseReport abusereport = AbuseReport.chat(this.N.i, s, reportevidence, reportedentity, this.N.L);
         return Either.left(new class02044(this.N.y, class03752.field_46064, abusereport));
      }
   }

   public void N(int var1) {
      this.N.N(var1, this.y);
   }

   public IntSet N() {
      return this.N.N;
   }
}
