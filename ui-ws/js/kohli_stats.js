data = null;
window.onload = function(){ 
                            fetch('../data/kohli_data.json')
                            .then(ele=>ele.json)
                            .then(ele => {
                                        data=ele;
                                    });
                                }

console.log(data);