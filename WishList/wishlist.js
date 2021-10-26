const mongoose = require('mongoose');
const Schema  = mongoose.Schema;

const wishlistSchema = new Schema({
    user_email:  String,
    product_id: String,
    date: { type: Date, default: Date.now },
});

module.exports = wishlistSchema ;