const express = require('express');
const router = express.Router();
const mongoose = require('mongoose');
const wishlistSchema = require('./wishlist');
const Wishlist = mongoose.model('Wishlist', wishlistSchema);

router.get('/', async (req, res) => {
	res.send(await Wishlist.find());
});

router.post('/', (req, res) => {
        const newWishlist = new Wishlist({user_email: req.body.user_email, product_id: req.body.product_id});
        newWishlist.save((err) => {
            if(err) return res.status(500).send('could not add wishlist');
            res.status(200).send('Success');
        });
});

router.delete('/', async (req, res) => {
	Wishlist.deleteOne({ _id: req.body.id }).then(data => res.send(data));
	//res.send(await Wishlist.find());
});

module.exports = router ;