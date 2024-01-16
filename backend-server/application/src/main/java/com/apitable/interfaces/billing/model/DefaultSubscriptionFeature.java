/*
 * APITable <https://github.com/apitable/apitable>
 * Copyright (C) 2022 APITable Ltd. <https://apitable.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.apitable.interfaces.billing.model;

import com.apitable.interfaces.billing.model.SubscriptionFeatures.ConsumeFeatures.AdminNums;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.ConsumeFeatures.ApiCallNumsPerMonth;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.ConsumeFeatures.ApiQpsNums;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.ConsumeFeatures.ArchivedRowsPerSheet;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.ConsumeFeatures.AutomationRunNumsPerMonth;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.ConsumeFeatures.CalendarViewNums;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.ConsumeFeatures.CapacitySize;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.ConsumeFeatures.FieldPermissionNums;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.ConsumeFeatures.FileNodeNums;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.ConsumeFeatures.FormNums;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.ConsumeFeatures.GanttViewNums;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.ConsumeFeatures.MirrorNums;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.ConsumeFeatures.NodePermissionNums;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.ConsumeFeatures.RowsPerSheet;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.ConsumeFeatures.Seat;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.ConsumeFeatures.TotalRows;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.ConsumeFeatures.WidgetNums;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SolidFeatures.AuditQueryDays;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SolidFeatures.RemainRecordActivityDays;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SolidFeatures.RemainTimeMachineDays;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SolidFeatures.RemainTrashDays;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SubscribeFeatures.AllowApplyJoin;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SubscribeFeatures.AllowCopyData;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SubscribeFeatures.AllowDownload;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SubscribeFeatures.AllowEmbed;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SubscribeFeatures.AllowExport;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SubscribeFeatures.AllowInvitation;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SubscribeFeatures.AllowOrgApi;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SubscribeFeatures.AllowShare;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SubscribeFeatures.ContactIsolation;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SubscribeFeatures.ControlFormBrandLogo;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SubscribeFeatures.ForbidCreateOnCatalog;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SubscribeFeatures.RainbowLabel;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SubscribeFeatures.ShowMobileNumber;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SubscribeFeatures.SocialConnect;
import com.apitable.interfaces.billing.model.SubscriptionFeatures.SubscribeFeatures.Watermark;

/**
 * Default subscription feature.
 */
public class DefaultSubscriptionFeature implements SubscriptionFeature {

    @Override
    public Seat getSeat() {
        return new Seat(-1L);
    }

    @Override
    public CapacitySize getCapacitySize() {
        return new CapacitySize(-1L);
    }

    @Override
    public FileNodeNums getFileNodeNums() {
        return new FileNodeNums(-1L);
    }

    @Override
    public RowsPerSheet getRowsPerSheet() {
        return new RowsPerSheet(-1L);
    }

    @Override
    public ArchivedRowsPerSheet getArchivedRowsPerSheet() {
        return new ArchivedRowsPerSheet(-1L);
    }

    @Override
    public TotalRows getTotalRows() {
        return new TotalRows(-1L);
    }

    @Override
    public MirrorNums getMirrorNums() {
        return new MirrorNums(-1L);
    }

    @Override
    public AdminNums getAdminNums() {
        return new AdminNums(10L);
    }

    @Override
    public ApiCallNumsPerMonth getApiCallNumsPerMonth() {
        return new ApiCallNumsPerMonth(-1L);
    }


    @Override
    public WidgetNums getWidgetNums() {
        return new WidgetNums(-1L);
    }

    @Override
    public AutomationRunNumsPerMonth getAutomationRunNumsPerMonth() {
        return new AutomationRunNumsPerMonth(-1L);
    }

    @Override
    public FormNums getFormNums() {
        return new FormNums(-1L);
    }

    @Override
    public GanttViewNums getGanttViewNums() {
        return new GanttViewNums(-1L);
    }

    @Override
    public CalendarViewNums getCalendarViewNums() {
        return new CalendarViewNums(-1L);
    }

    @Override
    public FieldPermissionNums getFieldPermissionNums() {
        return new FieldPermissionNums(-1L);
    }

    @Override
    public NodePermissionNums getNodePermissionNums() {
        return new NodePermissionNums(-1L);
    }

    @Override
    public ApiQpsNums getApiQpsNums() {
        return new ApiQpsNums(10L);
    }

    @Override
    public SocialConnect getSocialConnect() {
        return new SocialConnect(true);
    }

    @Override
    public RainbowLabel getRainbowLabel() {
        return new RainbowLabel(true);
    }

    @Override
    public Watermark getWatermark() {
        return new Watermark(true);
    }

    @Override
    public AllowInvitation getAllowInvitation() {
        return new AllowInvitation(true);
    }

    @Override
    public AllowApplyJoin getAllowApplyJoin() {
        return new AllowApplyJoin(true);
    }

    @Override
    public AllowShare getAllowShare() {
        return new AllowShare(true);
    }

    @Override
    public AllowExport getAllowExport() {
        return new AllowExport(true);
    }

    @Override
    public AllowDownload getAllowDownload() {
        return new AllowDownload(true);
    }

    @Override
    public AllowCopyData getAllowCopyData() {
        return new AllowCopyData(true);
    }

    @Override
    public AllowEmbed getAllowEmbed() {
        return new AllowEmbed(true);
    }

    @Override
    public ControlFormBrandLogo getControlFormBrandLogo() {
        return new ControlFormBrandLogo(true);
    }

    @Override
    public ShowMobileNumber getShowMobileNumber() {
        return new ShowMobileNumber(true);
    }

    @Override
    public ContactIsolation getContactIsolation() {
        return new ContactIsolation(true);
    }

    @Override
    public ForbidCreateOnCatalog getForbidCreateOnCatalog() {
        return new ForbidCreateOnCatalog(true);
    }

    @Override
    public RemainTrashDays getRemainTrashDays() {
        return new RemainTrashDays(365L);
    }

    @Override
    public RemainTimeMachineDays getRemainTimeMachineDays() {
        return new RemainTimeMachineDays(-1L);
    }

    @Override
    public RemainRecordActivityDays getRemainRecordActivityDays() {
        return new RemainRecordActivityDays(-1L);
    }

    @Override
    public AuditQueryDays getAuditQueryDays() {
        return new AuditQueryDays(-1L);
    }

    @Override
    public AllowOrgApi getAllowOrgApi() {
        return new AllowOrgApi(true);
    }
}
