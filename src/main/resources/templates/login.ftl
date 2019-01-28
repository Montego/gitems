<#--<#import "parts/common.ftl" as c>-->

<#--<@c.page>-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>gItem</title>
    <link rel="stylesheet" href="/static/css/style.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.2/css/uikit.min.css" />
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">

    <div class="uk-cover-container greeting_page">
        <img src="static/img/greeting.jpg" alt="greeting" uk-cover>

        <div class="login_form">

            <form action="/login" method="post">
                <div class="uk-margin">
                    <div class="uk-inline">
                        <span class="uk-form-icon" uk-icon="icon: user"></span>
                        <input class="uk-input" type="text">
                    </div>
                </div>
                <div class="uk-margin">
                    <div class="uk-inline">
                        <span class="uk-form-icon uk-form-icon-flip" uk-icon="icon: lock"></span>
                        <input class="uk-input" type="text">
                    </div>
                </div>
                <input type="hidden" name="_csrf" value="{_csrf.token}">
                <div><input type="submit" value="Sign in"></div>
                <#--<button class="uk-button uk-button-default">Log in</button>-->
                <a class="uk-button uk-button-text" href="#">
                    Registration
                </a>
            </form>

        </div>

    </div>

</head>
<body>

<!-- UIkit JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.2/js/uikit.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.2/js/uikit-icons.min.js"></script>
</body>
</html>

<#--</@c.page>-->