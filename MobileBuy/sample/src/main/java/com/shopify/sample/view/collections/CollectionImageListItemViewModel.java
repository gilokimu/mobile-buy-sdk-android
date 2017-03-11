package com.shopify.sample.view.collections;

import com.shopify.sample.R;
import com.shopify.sample.presenter.collections.model.Collection;
import com.shopify.sample.view.base.ListItemViewModel;
import com.shopify.sample.view.base.ListViewItemHolder;
import com.shopify.sample.view.base.ShopifyDraweeView;

import butterknife.BindView;

final class CollectionImageListItemViewModel extends ListItemViewModel<Collection> {

  CollectionImageListItemViewModel(final Collection payload) {
    super(payload, R.layout.collection_image_list_item);
  }

  @Override public ListViewItemHolder<Collection, ListItemViewModel<Collection>> createViewHolder() {
    return new ViewItemHolder();
  }

  static final class ViewItemHolder extends ListViewItemHolder<Collection, ListItemViewModel<Collection>> {
    @BindView(R.id.image) ShopifyDraweeView imageView;

    @Override public void bindModel(final ListItemViewModel<Collection> listViewItemModel) {
      super.bindModel(listViewItemModel);
      imageView.loadShopifyImage(listViewItemModel.payload().imageUrl());
    }
  }
}