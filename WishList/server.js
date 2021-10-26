const express = require('express')
const app = express()
const mongoose = require('mongoose');
const controller = require('./controller');
const port = 20000

const Eureka = require('eureka-js-client').Eureka;
 
const client = new Eureka({
// application instance information
instance: {
    app: 'WishlistService',
    instanceId: 'http://wishlist-service:20000',
    hostName: 'wishlist-service',
    ipAddr: 'wishlist-service',
    port: {
        '$': port,
        '@enabled': 'true',
    },
    vipAddress: 'wishlist-service:20000',
    dataCenterInfo: {
'@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
        name: 'MyOwn',
    },
    registerWithEureka: false,
    fetchRegistry: false
},
eureka: {
    // eureka server host / port
    host: 'eureka-server',
    port: 50000,
    servicePath: '/eureka/apps',
    maxRetries: 100,
    requestRetryDelay: 10000
},
 });

client.start((error) => {
           console.log(error || 'complete');
    });

app.use(express.json());
app.use('/wishlist', controller);
app.get('/', (req, res) => {
  res.send('Hello World!')
})

app.get('/close', (req, res) => {
	//client.stop(); 
	res.send('done!')
})

mongoose.connect("mongodb+srv://khaled:khaled@cluster0.ajsco.mongodb.net/awd?authSource=admin&replicaSet=atlas-zv7ysq-shard-0&readPreference=primary&ssl=true"
	,{useNewUrlParser: true, useUnifiedTopology: true}).catch(() => console.log('could not connect to DB'));
app.listen(port, () => {
  console.log(`Example app listening at http://localhost:${port}`)
})

process.on('beforeExit', (code) => {
  client.stop();
});