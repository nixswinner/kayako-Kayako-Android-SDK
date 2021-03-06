package com.kayako.sdk.android.k5.common.adapter.list;

import com.kayako.sdk.android.k5.common.adapter.BaseListItem;
import com.kayako.sdk.base.parser.Resource;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew <neil.mathew@kayako.com>
 */
public class ListItem extends BaseListItem {

    private String title;
    private String subtitle;
    private Resource resource;

    public ListItem(String title, String subtitle, Resource resource) {
        super(ListType.LIST_ITEM);
        this.title = title;
        this.subtitle = subtitle;
        this.resource = resource;
    }

    protected ListItem(int listType, String title, String subtitle, Resource resource) {
        super(listType);
        this.title = title;
        this.subtitle = subtitle;
        this.resource = resource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public Map<String, String> getContents() {
        Map<String, String> map = new HashMap<>();
        map.put("title", String.valueOf(title));
        map.put("subtitle", String.valueOf(subtitle));
        return map;
    }
}
